package algorithms.CountingValleys

static int countingValleys(int n, String s) {
    int seaLevel = 0

    return s.toList().count({
        it == 'U'? seaLevel++ : seaLevel--
        return it == 'U' && seaLevel == 0
    })
}


println(countingValleys(8, "UDDDUDUU"))       //1
println(countingValleys(12, "DDUUDDUDUUUD"))  //2
println(countingValleys(2, "DD"))             //0 - because didn't leave a valley
