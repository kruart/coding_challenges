package algorithms.TheFullCountingSort

// https://www.hackerrank.com/challenges/countingsort4/problem
List<List<String>> s = (0..99).collect(){ [] }

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
int n = br.readLine() as Integer
int half = n / 2

n.times { idx ->
    String[] pair = br.readLine().split(" ")
    String ch = idx < half ? '-' : pair[1]
    s[Integer.parseInt(pair[0])].add(ch)
}

StringBuilder sb = new StringBuilder()
for (List<String> l  : s) {
    if (!l.isEmpty()) sb.append(String.join(" ", l)).append(" ")
}
println(sb)
br.close()

