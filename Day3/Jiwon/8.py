# 핸드폰 번호 가리기
# https://school.programmers.co.kr/learn/courses/30/lessons/12948
def solution(phone_number):
    return '*' * (len(phone_number) - 4) + phone_number[-4:]

if __name__ == '__main__':
    phone_number1 = "01033334444"
    phone_number2 = "027778888"
    print(f"Result1: {solution(phone_number=phone_number1)}")
    print(f"Result2: {solution(phone_number=phone_number2)}")