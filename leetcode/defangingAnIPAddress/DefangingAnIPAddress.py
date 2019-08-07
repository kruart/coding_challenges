# https://leetcode.com/problems/defanging-an-ip-address/
class DefangingAnIPAddress:
    def defangIPaddr(self, address: str) -> str:
        return address.replace(".", "[.]")
