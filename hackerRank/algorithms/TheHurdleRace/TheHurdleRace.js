function hurdleRace(k, height) {
    const max = Math.max(...height);
    return k - max >= 0 ? 0 : max - k;
}