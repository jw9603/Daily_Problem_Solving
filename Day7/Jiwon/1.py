# 캐시
# https://school.programmers.co.kr/learn/courses/30/lessons/17680

from collections import deque
def solution(cacheSize, cities):
    # cache hit: CPU가 참조하고자 하는 메모리가 캐시에 존하 있는 경우
    # cache miss: CPU가 참조하고자 하는 메모리가 캐시에 존재하지 않는 경우
    # Queue에서 맨 뒤가 가장 최근, 앞이 오래된 것
    cache = deque(maxlen=cacheSize)
    time = 0
    
    if cacheSize == 0:
        return len(cities) * 5
    
    for city in cities:
        city = city.lower()
        
        if city in cache:
            time += 1
            cache.remove(city)
            cache.append(city)
        else:
            time += 5
            if len(cache) >= cacheSize:
                cache.popleft()
            cache.append(city)
    return time

if __name__ == '__main__':
    cacheSize1, cities1 = 3, ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
    cacheSize2, cities2 = 3, ["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]
    cacheSize3, cities3 = 2, ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"]
    cacheSize4, cities4 = 5, ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"]
    cacheSize5, cities5 = 2, ["Jeju", "Pangyo", "NewYork", "newyork"]
    cacheSize6, cities6 = 0, ["Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
    
    print(f"Result1: {solution(cacheSize=cacheSize1, cities=cities1)}")
    print(f"Result2: {solution(cacheSize=cacheSize2, cities=cities2)}")
    print(f"Result3: {solution(cacheSize=cacheSize3, cities=cities3)}")
    print(f"Result4: {solution(cacheSize=cacheSize4, cities=cities4)}")
    print(f"Result5: {solution(cacheSize=cacheSize5, cities=cities5)}")
    print(f"Result6: {solution(cacheSize=cacheSize6, cities=cities6)}")
