class Solution:
    def isPalindrome(self, s: str) -> bool:
            cleaned = ''.join(char.lower() for char in s if char.isalnum())
            rev= cleaned[::-1]
            if rev==cleaned:
                return True
            else:
                    return False