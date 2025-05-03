//popup message 
alert("Welcome to My Website");

//take user input use of prompt that value we can store in any variable
prompt("What are Doing today");

const instgramPro = {
    Name : "Vivek",
    Surname : "Hande",
    Followers : 1002,
    Following : 600
};

console.log(instgramPro);
console.log(instgramPro["Followers"]);
console.log(instgramPro.Following);

//we can change variable of in object 
instgramPro["Name"] = "Athrva";
instgramPro["Followers"]= "002";
console.log(instgramPro.Name);
console.log(instgramPro.Followers);


//when we use of let keyword we cant create this type of another variable we can only uapdate their value
let x = 110;
console.log(x);

//when we use of ver keyword we can rediclear that varable many time and also update their value
var y = 200;
console.log(y);

const z = 300;
//this keyword only for the fix value that cant change and cant update

let m = BigInt("2344");
console.log(m);
console.log(typeof m);
//output - 2344n

let n = Symbol(2455);
console.log(n);
console.log(typeof n);
//output - Symbol(2455) 

let number = prompt("Enter number");
console.log(number);

if(number % 5 == 0){
    console.log("It is multiple of five"); 
}else{
    console.log("It is not multiple of five");
}

//for read each one charecter of string and array " for of loop"
var str = "myname ";

for(let i of str){
    console.log("str",i);
}

//for read each variable in the object and array "for in loop"

const Man = {
    Rname : "Vivek ",
    Rsurname : "Hande",
    Rage : 24
};

for(let key in Man){
    console.log("Key =" , key , "value = " , Man[key]);
}

let username = prompt("Enter the full name");
console.log("@"+username+username.length);

//string are immuteable in js and java

//array in js

let array = [250,645,300,900,50];
console.log(array);
let nut;

for(let nutt of array){
    nut = [array[nutt]*10]/100;
    
}
console.log(nut);

let arr1 = [1,3,4,5,4,7,8];
let arr2 = [3,4,6,7,9,6,8];

console.log(arr1.concat(arr2));

arr1.push(3);
arr1.push(11);
console.log(arr1);

arr2.push(22);
arr2.push(33);
console.log(arr2);

arr1.pop();
arr1.pop(4);
console.log(arr1);

console.log(arr1.slice(2,5));

function sum(a ,b){
    return a+b;
}

let car = sum();
// console.log(car);

//function

const arroSum = (a , b) => {
    return a+b;
}
let coun = 0;
function calVol(str){
    for(let vk of str){
        if(str[vk] === 'a' || str[vk] === 'e' || str[vk] === 'o' || str[vk] === 'i' || str[vk] === 'u'){
            coun+=1;
        }
    }
    console.log(coun);
}
calVol("Tjfhgiiiibkjfhdk");

//for read every element in the array.
let = 0;
let me = [1,2,34,53,3];
me.forEach(function sqrt(me){
    console.log(me*me);
});

//for print every element in the array and aslo it is work like "for each" loop
let arroy = [40 , 50 , 60 , 70];
let asti = arroy.map((val)=>{
    return val;
});
console.log(asti);

//to filter some values that want to print in the new array 
let amo = [20,40,33,21,44,66,67];
let anmo = amo.filter((val)=>{
    return val %2 ===0;
})
console.log(anmo);

//use of reduce method which is the main use is array is reduce in the single element
let k = prompt("enter element that make an array");
let aste = [];
for(let i=1; i<=k; i++){
    aste[i -1] = i;
}
console.log(aste);
let pk = aste.reduce((res , curr)=>{
    return res + curr;
})
console.log(pk);

//