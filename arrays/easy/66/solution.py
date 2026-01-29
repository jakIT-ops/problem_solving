class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        number = "".join(map(str, digits))
        plussed_number = int(number) + 1

        res = [int(digit) for digit in str(plussed_number)]
        return res
