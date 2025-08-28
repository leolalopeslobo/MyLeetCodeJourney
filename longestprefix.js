// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.


strs = ["flower","flow","flight", "flew"]

var longestPrefix = ""
var flag = true

shortestStr = strs[0]
for (var i=1; i<strs.length; i++){
    if(strs[i].length < shortestStr.length){
        shortestStr = strs[i]
    }
}
for (var char = 0; char < shortestStr.length; char++) {
    for(var i=0; i<strs.length; i++){
        if(i+1 == strs.length){
            continue
        }
        if(strs[i][char] != strs[i+1][char]){
            flag = false
            break
        }
    }
    if (flag) {
        longestPrefix += strs[0][char];
    }
    shortestStr.length = shortestStr.length - 1
    char++
}
console.log(longestPrefix)
