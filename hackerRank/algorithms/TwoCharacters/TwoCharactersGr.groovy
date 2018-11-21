package algorithms.TwoCharacters

// https://www.hackerrank.com/challenges/two-characters/problem
static alternate(String s) {
    Set<String> pairs = uniquePairs(s.toSet())
    maxLength(pairs, s)
}

static uniquePairs(Set<String> elements) {
    [elements, elements].combinations()
            .findAll { a, b -> a < b }
            *.join('')
}

static maxLength(Set<String> pairs, String s) {
    pairs.collect { s.replaceAll("[^$it]", '') }
            .findAll { it.matches('^(.)((?!\\1).\\1)*(?!\\1).?$') }
            *.length()  // .collect { it.length() }
            .max() ?: 0
}

def sc = new Scanner(System.in)
def n = sc.nextLine()
def str = sc.nextLine()
println(alternate(str))