from tkinter import *
window = Tk()
window.title("Calculator")
window.geometry("500x300")
window.config(bg="black")
#ENTRY BOX
e1=Entry(window,width=77,borderwidth=5)
e1.place(x=0,y=0)
#BUTTONS
def click(num):
    result=e1.get()#THIS IS USED TO RETRIEVE THE CURRENT TEXT FROM THE TKINTER ENTRY WIDGET
    e1.delete(0,END)#WE USED DELETE BECAUSE TO DELETE THE PREVIOUS NUMBR SO THAT REPETITION DOES NOT TAKE PLACE...HERE END MEANS TO DELETE UPTO LAST TERMS
    e1.insert(0,str(result)+str(num))

def add():
    n1=e1.get()
    global math
    math="addition"
    global i
    i=int(n1)
    e1.delete(0,END)

def minus():
    n1=e1.get()
    global math
    math="substraction"
    global i
    i=int(n1)
    e1.delete(0,END)

def multiply():
    n1=e1.get()
    global math
    math="multiplication"
    global i
    i=int(n1)
    e1.delete(0,END)

def divide():
    n1=e1.get()
    global math
    math="division"
    global i
    i=int(n1)
    e1.delete(0,END)

def equalto():
    n2=e1.get()
    e1.delete(0,END)
    if math=="addition":
        e1.insert(0,i+int(n2))
    elif math=="substraction":
        e1.insert(0,i-int(n2))
    elif math=="multiplication":
        e1.insert(0,i*int(n2))
    elif math=="division":
        e1.insert(0,i/int(n2))
    elif math=="percentage":
        e1.insert(0,i)

def percentage():
    n1=e1.get()
    global i
    global math
    math="percentage"
    i=float(n1)/100
    e1.delete(0,END)

def clear():
    e1.delete(0,END)

def clear2():
    e1.delete(len(e1.get())-1,END)
b=Button(window,text="7",width=12,bg="grey",command=lambda:click(7))#WE USED LAMBDA BECAUSE IT MEANS "WHEN THE BUTTON IS CLICKED THEN CALL CLICK(7)"
b.place(x=10,y=60)

b=Button(window,text="8",width=12,bg="grey",command=lambda:click(8))
b.place(x=80,y=60)

b=Button(window,text="9",width=12,bg="grey",command=lambda:click(9))
b.place(x=170,y=60)

b=Button(window,text="4",width=12,bg="grey",command=lambda:click(4))
b.place(x=10,y=120)

b=Button(window,text="5",width=12,bg="grey",command=lambda:click(5))
b.place(x=80,y=120)

b=Button(window,text="6",width=12,bg="grey",command=lambda:click(6))
b.place(x=170,y=120)

b=Button(window,text="1",width=12,bg="grey",command=lambda:click(1))
b.place(x=10,y=180)

b=Button(window,text="2",width=12,bg="grey",command=lambda:click(2))
b.place(x=80,y=180)

b=Button(window,text="3",width=12,bg="grey",command=lambda:click(3))
b.place(x=170,y=180)

b=Button(window,text="0",width=12,bg="grey",command=lambda:click(0))
b.place(x=80,y=240)

b=Button(window,text="/",width=12,bg="grey",command=divide)
b.place(x=280,y=60)

b=Button(window,text="*",width=12,bg="grey",command=multiply)
b.place(x=280,y=120)

b=Button(window,text="-",width=12,bg="grey",command=minus)
b.place(x=280,y=180)

b=Button(window,text="+",width=12,bg="grey",command=add)
b.place(x=280,y=240)

b=Button(window,text="=",width=12,bg="grey",command=equalto)
b.place(x=380,y=240)

b=Button(window,text="clear",width=12,bg="grey",command=clear)
b.place(x=380,y=60)

b=Button(window,text="<--",width=12,bg="grey",command=clear2)
b.place(x=380,y=120)

b=Button(window,text="%",width=12,bg="grey",command=percentage)
b.place(x=380,y=180)
mainloop()