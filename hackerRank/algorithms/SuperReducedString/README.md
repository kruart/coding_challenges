### [Super Reduced String](https://www.hackerrank.com/challenges/reduced-string/problem)
Steve has a string of lowercase characters in range <code> ascii[‘a’..’z’]</code>. He wants to reduce the string to its shortest length by doing a series of operations. In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the string <code>aab</code> could be shortened to <code>b</code> in one operation.

Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print <code>Empty String</code>
***

**Function Description**  
Complete the *superReducedString* function in the editor below. It should return the super reduced string or <code>Empty String</code> if the final string is empty.

*superReducedString* has the following parameter(s):
+ s: a string to reduce

**Input Format**  
A single string, *s*.

**Constraints**
        
        1 <= |s| <= 100

**Output Format**  
If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

**Sample Input 0**  
        
        aaabccddd

**Sample Output 0**  

        abd

**Explanation 0**  
Steve performs the following sequence of operations to get the final string:  
<code>aaabccddd → abccddd → abddd → abd</code>

**Sample Input 1**  
        
        aa

**Sample Output 1**  

        Empty String

**Explanation 1**  
<code>aa → Empty String</code>

**Sample Input 2**  
        
        baab

**Sample Output 2**  

        Empty String

**Explanation 2**  
<code>baab → bb → Empty String</code>
