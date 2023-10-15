function solution(phone_book) {
    phone_book.sort((a, b) => {
        return a.length - b.length;
    });
    
    let hash = {};
    let answer = true;
    phone_book.map((call) => {
        const callLength = call.length;
        for (let i = 0; i < callLength; i++) {
            const subCall = call.substring(0, i);
            if (hash[subCall]) {
                answer = false;
            }
        }
        hash[call] = 1;
    });
    
    return answer;
}
