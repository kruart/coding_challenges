package data_structures.SparseArrays

// https://www.hackerrank.com/challenges/sparse-arrays/problem
static matchingStrings(List strings, List queries) {
    def queryMap = queries.collectEntries({[(it): 0]})

    for (String str : strings) {
        if (str in queries) queryMap[str] += 1
    }
    return queries.collect({queryMap[it]})
}


l1 = matchingStrings(["aba", "baba", "aba", "xzxb"], ["aba", "xzxb", "ab"]) //2 1 0
l2 = matchingStrings(["def", "de", "fgh"], ["de", "lmn", "fgh"])            //1 0 1
l3 = matchingStrings(["abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"],
        ["abcde", "sdaklfj", "asdjf", "na", "basdn", "abcde"])              //1 3 4 3 2 1

println(l1)
println(l2)
println(l3)
