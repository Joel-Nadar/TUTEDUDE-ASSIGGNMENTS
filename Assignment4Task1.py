try:
    f=open('story.txt','r')
    l1=f.readline()
    l2=f.readline()
    print("Reading file content:")
    print(f"Line 1: {l1}")
    print(f"Line 2: {l2}")
    f.close()
except FileNotFoundError:
    print("Error: The file 'story.txt' was not found")