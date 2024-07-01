import random 

def generate():
    string = ""

    for i in range(0,6):
        num = random.randint(97,122)
        string = string + chr(num)
        num = random.randint(65,90)
        string = string + chr(num)
        num = random.randint(48,57)
        string = string + chr(num)
        num = random.randint(33,47)
        string = string + chr(num)

    characters = list(string)
    random_sample = random.sample(characters, len(characters))
    newString = ''.join(random_sample)
    return newString

if __name__ == "__main__":
    length = int(input("How long do you want the password to be? "))
    result = generate()
    print(result[:length])
