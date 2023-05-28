class Solution:
    def minExtraChar(self, s: str, dictionary: list[str]) -> int:
        dictionary.sort(key=len, reverse=True)  # sort the dictionary, largest words first
        count = 0
        original_length = len(s)

        for word in dictionary:
            if word in s:
                count += len(word)
                s = s[:s.find(word)] + s[s.find(word) + len(word):]  # remove the found word from the inputString
                print(f'found: {word}, inputString left: "{s}"')

        return original_length - count


# executing the above Solution class
s = "leetscode"
dictionary = ["leet", "code", "leetcode"]

solution = Solution()
print(f'Extra chars: {solution.minExtraChar(s, dictionary)}')
