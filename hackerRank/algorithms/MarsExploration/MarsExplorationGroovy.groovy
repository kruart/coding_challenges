package algorithms.MarsExploration

// https://www.hackerrank.com/challenges/mars-exploration/problem
static def marsExploration(String s) {
    def msg = "SOS"
    return (0..s.length() - 1).count({ (s[it] != msg[it % 3]) })
}

println marsExploration("SOSSPSSQSSOR");    //3
println marsExploration("SOSSOT");          //1
println marsExploration("SOSSOSSOS");       //0
