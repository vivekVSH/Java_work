//used for the join the two table which is same coloum
select s.roll_no,s.phone,s.subject,sc.student_id
from Student s
join StudentCourse sc ON  sc.roll_no = s.roll_no;

//used for inner join
select Student.roll_no, Student.phone, Student.subject, StudentCourse.student_id
from Student
INNER JOIN StudentCourse
ON Student.roll_no = StudentCourse.roll_no;

//used for left join
select Student.roll_no, Student.phone, Student.subject, StudentCourse.student_id
from Student
LEFT JOIN StudentCourse
ON StudentCourse.roll_no = Student.roll_no;

//used for right join
select Student.roll_no,Student.phone,Student.subject,StudentCourse.student_id
from Student
RIGHT JOIN StudentCourse
ON Student.roll_no = StudentCourse.roll_no;

//used for natural join

