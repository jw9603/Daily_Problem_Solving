# 모의고사
# https://school.programmers.co.kr/learn/courses/30/lessons/42840
def solution(answers):
    patterns = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    scores = [0, 0, 0]

    for i, answer in enumerate(answers):
        for j in range(3):
            if answer == patterns[j][i % len(patterns[j])]:
                scores[j] += 1
    return [i + 1 for i, score in enumerate(scores) if score == max(scores)]

if __name__ == '__main__':
    answers1 = [1,2,3,4,5]
    answers2 = [1,3,2,4,2]
    print(f"Result1: {solution(answers=answers1)}")
    print(f"Result2: {solution(answers=answers2)}")