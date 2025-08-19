stu={}
ch=str(input("Enter y/n "))
while ch=='y':
    name=input("Enter student name ")
    marks=int(input("Enter marks "))
    stu[name]=marks
    ch=str(input("Want to continue (y/n)"))
name=str(input("Enter the student's name: "))
if name in stu:
    print(f"{name}'s marks: {stu.get(name)}")
else:
    print("Student not found.")