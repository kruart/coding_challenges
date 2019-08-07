package defangingAnIPAddress

// https://leetcode.com/problems/defanging-an-ip-address/
object DefangingAnIPAddressS {
  def defangIPaddr(address: String): String = {
    //    address.replaceAll("\\.", "[.]")
    address.map {
      case '.' => "[.]"
      case a => a.toString
    }.mkString("")
  }
}
