import requests
import pandas as pd
import time
from openpyxl import load_workbook

def fetch_crypto_data():
    """
    Fetch live cryptocurrency data from CoinGecko API.
    Returns: List of cryptocurrency data.
    """
    url = "https://api.coingecko.com/api/v3/coins/markets"
    params = {
        "vs_currency": "usd",
        "order": "market_cap_desc",
        "per_page": 50,
        "page": 1,
        "sparkline": False
    }

    response = requests.get(url, params=params)
    if response.status_code == 200:
        return response.json()
    else:
        print(f"Error fetching data: {response.status_code}")
        return []

def process_data(data):
    """
    Process the raw data from API into a Pandas DataFrame.
    Args:
        data: List of cryptocurrency data.
    Returns: Processed DataFrame.
    """
    processed_data = []
    for item in data:
        processed_data.append({
            "Name": item["name"],
            "Symbol": item["symbol"].upper(),
            "Current Price (USD)": item["current_price"],
            "Market Cap": item["market_cap"],
            "24h Volume": item["total_volume"],
            "Price Change (24h %)": item["price_change_percentage_24h"]
        })
    return pd.DataFrame(processed_data)

def analyze_data(df):
    """
    Perform basic analysis on the cryptocurrency data.
    Args:
        df: DataFrame containing cryptocurrency data.
    Prints: Analysis results.
    """
    # Top 5 by market cap
    top_5 = df.nlargest(5, "Market Cap")
    print("Top 5 Cryptocurrencies by Market Cap:\n", top_5)

    # Average price
    average_price = df["Current Price (USD)"].mean()
    print(f"\nAverage Price of Top 50 Cryptocurrencies: ${average_price:.2f}")

    # Highest and lowest 24-hour percentage change
    highest_change = df.nlargest(1, "Price Change (24h %)")
    lowest_change = df.nsmallest(1, "Price Change (24h %)")
    print("\nHighest 24-hour % Change:\n", highest_change)
    print("\nLowest 24-hour % Change:\n", lowest_change)

def save_to_excel(df, filename="crypto_live_data.xlsx"):
    """
    Save the DataFrame to an Excel file.
    Args:
        df: DataFrame containing cryptocurrency data.
        filename: Name of the Excel file.
    """
    df.to_excel(filename, index=False)
    print(f"Data saved to {filename}")

if __name__ == "__main__":
    # Fetch, process, analyze, and save data
    while True:
        print("\nFetching live cryptocurrency data...")
        data = fetch_crypto_data()
        if data:
            df = process_data(data)
            
            # Perform analysis
            print("\nPerforming data analysis...")
            analyze_data(df)

            # Save data to Excel
            save_to_excel(df)

            # Wait for 5 minutes before next update
            print("\nWaiting for 5 minutes before next update...")
            time.sleep(300)
        else:
            print("\nRetrying in 5 minutes...")
            time.sleep(300)
