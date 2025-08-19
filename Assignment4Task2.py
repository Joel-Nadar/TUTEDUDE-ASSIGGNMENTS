with open('output.txt','a') as f:
    for i in range(2):
        l=str(input("Enter text to write to the file: "))
        f.write(l)
        f.write('\n')
        print("Data successfully written to output.txt.")
print("Final content of output.txt: ")
f=open('output.txt','r')
reading_file=f.read()
print(reading_file)
f.close()