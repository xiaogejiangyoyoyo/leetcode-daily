public int arrangeCoins(int n) {
    int l = 0, h = n;
    while(l <= h){
        int m = l + (h - l) / 2;
        long x = m * (m + 1L) / 2;
        if(x == n) return m;
        else if(x < n) l = m + 1;
        else h = m - 1;
    }
    return h;
}
/*
public int arrangeCoins(int n) {
    int level = 1;
    while (n > 0) {
        n -= level;
        level++;
    }
    return n == 0 ? level - 1 : level - 2;
}*/