package algorithms.BiggerIsGreater

import scala.util.control.Breaks.{breakable, break}

// https://www.hackerrank.com/challenges/bigger-is-greater/problem
object BiggerIsGreaterSc extends App {
  def biggerIsGreater(w: String): String = {
    val cs = w.toCharArray
    var index = 0

    breakable {
      for (i <- w.length-2 to 0 by -1) {
        for (j <- w.length-1 until i by -1) {
          // swap two chars if w(j) > w(i) and break
          if (w(j) > w(i)) {
            cs(i) = w(j)
            cs(j) = w(i)
            index = i
            break
          }
        }
      }
    }

    if (cs.mkString("") != w) {
      //get chars up to inclusive index + get sorted chars in asc order after index
      cs.take(index+1).mkString("") + cs.takeRight(cs.length() - index-1).sorted.mkString("")
    } else {
      "no answer"
    }
  }

  assert(biggerIsGreater("ab") == "ba")
  assert(biggerIsGreater("bb") == "no answer")
  assert(biggerIsGreater("hefg") == "hegf")
  assert(biggerIsGreater("dhck") == "dhkc")
  assert(biggerIsGreater("dkhc") == "hcdk")
  assert(biggerIsGreater("lmno") == "lmon")
  assert(biggerIsGreater("dcba") == "no answer")
  assert(biggerIsGreater("dcbb") == "no answer")
  assert(biggerIsGreater("abdc") == "acbd")
  assert(biggerIsGreater("abcd") == "abdc")
  assert(biggerIsGreater("fedcbabcd") == "fedcbabdc")
  assert(biggerIsGreater("imllmmcslslkyoegymoa") == "imllmmcslslkyoegyoam")
  assert(biggerIsGreater("fvincndjrurfh") == "fvincndjrurhf")
  assert(biggerIsGreater("rtglgzzqxnuflitnlyit") == "rtglgzzqxnuflitnlyti")
  assert(biggerIsGreater("mhtvaqofxtyrz") == "mhtvaqofxtyzr")
  assert(biggerIsGreater("zalqxykemvzzgaka") == "zalqxykemvzzgkaa")
  assert(biggerIsGreater("wjjulziszbqqdcpdnhdo") == "wjjulziszbqqdcpdnhod")
  assert(biggerIsGreater("japjbvjlxzkgietkm") == "japjbvjlxzkgietmk")
  assert(biggerIsGreater("jqczvgqywydkunmjw") == "jqczvgqywydkunmwj")
  assert(biggerIsGreater("ehdegnmorgafrjxvksc") == "ehdegnmorgafrjxvsck")
  assert(biggerIsGreater("tydwixlwghlmqo") == "tydwixlwghlomq")
  assert(biggerIsGreater("wddnwjneaxbwhwamr") == "wddnwjneaxbwhwarm")
  assert(biggerIsGreater("pnimbesirfbivxl") == "pnimbesirfbixlv")
  assert(biggerIsGreater("mijamkzpiiniveik") == "mijamkzpiiniveki")
  assert(biggerIsGreater("qxtwpdpwexuej") == "qxtwpdpwexuje")
  assert(biggerIsGreater("qtcshorwyck") == "qtcshorwykc")
  assert(biggerIsGreater("xoojiggdcyjrupr") == "xoojiggdcyjrurp")
  assert(biggerIsGreater("vcjmvngcdyabcmjz") == "vcjmvngcdyabcmzj")
  assert(biggerIsGreater("xildrrhpca") == "xildrrpach")
  assert(biggerIsGreater("rrcntnbqchsfhvijh") == "rrcntnbqchsfhvjhi")
  assert(biggerIsGreater("kmotatmrabtcomu") == "kmotatmrabtcoum")
  assert(biggerIsGreater("bnfcejmyotvw") == "bnfcejmyotwv")
  assert(biggerIsGreater("dnppdkpywiaxddoqx") == "dnppdkpywiaxddoxq")
  assert(biggerIsGreater("tmowsxkrodmkkra") == "tmowsxkrodmkrak")
}
