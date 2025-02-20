# 전화번호 목록
# https://school.programmers.co.kr/learn/courses/30/lessons/42577
def solution(phone_book):
    phone_book = set(phone_book)
    for phone in phone_book:
        for i in range(1, len(phone)):
            if phone[:i] in phone_book:
                return False
    return True

if __name__ == '__main__':
    phone_book1 = ["119", "97674223", "1195524421"]
    phone_book2 = ["123","456","789"]
    phone_book3 = ["12","123","1235","567","88"]
    
    print(f"Result1: {solution(phone_book=phone_book1)}")
    print(f"Result2: {solution(phone_book=phone_book2)}")
    print(f"Result3: {solution(phone_book=phone_book3)}")