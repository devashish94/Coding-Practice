def check(output: list[int], value: int) -> bool:
    m = {}
    for i in output:
        m[i] = m.get(i, 0) + 1
    count = 0
    for item in m.keys():
        if item + value in m.keys():
            count += 1
    return False if count > 0 else True


class Solution:
    save = []

    def beautifulSubsets(self, input_array: list[int], k: int) -> int:
        self.save.clear()
        i = 0
        output_array = []
        self.subset(i, input_array, output_array, k)
        return len(self.save)

    def subset(self, i, input_array: list[int], output_array: list[int], value: int) -> None:
        if i == len(input_array):
            if len(output_array) == 1:
                self.save.append(1)
            elif len(output_array) > 1 and check(output_array, value):
                self.save.append(1)
            return
        output_array.append(input_array[i])
        self.subset(i + 1, input_array, output_array, value)
        output_array.pop()
        self.subset(i + 1, input_array, output_array, value)


arr = [300,180,90,165,255,30,60,240,45,120,135,270,75,150,210,195,105,15,225,285]
key = 15
print(f'answer: {Solution().beautifulSubsets(arr, key)}')
