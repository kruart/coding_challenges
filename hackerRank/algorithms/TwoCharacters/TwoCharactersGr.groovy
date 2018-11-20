package algorithms.TwoCharacters

// https://www.hackerrank.com/challenges/two-characters/problem
def static alternate(String s) {
    Set<String> pairs = uniquePairs(s.toSet())
    return maxLength(pairs, s)
}

def static uniquePairs(Set elements) {
    return [elements, elements].combinations()
            .findAll { a, b -> a < b }
            .collect({it.join("")})
}

def static maxLength(Set pairs, String s) {
    pairs.collect { s.replaceAll("[^$it]", "") }
            .findAll { it.matches('^(.)((?!\\1).\\1)*(?!\\1).?$') }
            .collect { it.length() }
            .max() ?: 0
}

def sc = new Scanner(System.in)
def n = sc.nextLine()
def str = sc.nextLine()
println(alternate(str))