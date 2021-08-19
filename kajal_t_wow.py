def expand(str, low, high): 
    length = len(str) 
    while low >= 0 and high < length and str[low] == str[high]:
        low = low - 1
        high = high + 1
    return str[low + 1:high]

def LongestPalindrome(str, length):
    max_str = ""
    max_length = 0 
    for i in range(length): 
        curr_str = expand(str, i, i)
        curr_length = len(curr_str)
 
        if curr_length > max_length:
            max_length = curr_length
            max_str = curr_str
 
        curr_str = expand(str, i, i + 1)
        curr_length = len(curr_str)

        if curr_length > max_length:
            max_length = curr_length
            max_str = curr_str
 
    return max_str

def ShortestPalindrome(s):
	n = len(s)
	ans = s[0]
	for i in range(1, n):
		ans = min(ans, s[i])
	return ans

s = str(input())
	
shortlen = len(ShortestPalindrome(s))
longlen = len(LongestPalindrome(s, len(s) - 1))

print(abs(shortlen-longlen))
