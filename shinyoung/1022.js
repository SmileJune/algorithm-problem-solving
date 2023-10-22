function solution(money) {
    let dpWithoutFirstHouse = Array(money.length - 1).fill(0);
    let dpWithoutLastHouse = Array(money.length - 1).fill(0);
    dpWithoutFirstHouse[0] = money[1];
    dpWithoutFirstHouse[1] = Math.max(money[1], money[2]);
    dpWithoutLastHouse[0] = money[0];
    dpWithoutLastHouse[1] = Math.max(money[0], money[1]);
    
    for (let i = 2; i < money.length - 1; i++) {
        dpWithoutLastHouse[i] = Math.max(dpWithoutLastHouse[i - 1], dpWithoutLastHouse[i - 2] + money[i]);
        dpWithoutFirstHouse[i] = Math.max(dpWithoutFirstHouse[i - 1], dpWithoutFirstHouse[i - 2] + money[i + 1]);
    }
    
    const lastIndex = dpWithoutFirstHouse.length - 1;
    return Math.max(Math.max(dpWithoutLastHouse[lastIndex], dpWithoutLastHouse[lastIndex - 1]), Math.max(dpWithoutFirstHouse[lastIndex], dpWithoutFirstHouse[lastIndex - 1]));
}
