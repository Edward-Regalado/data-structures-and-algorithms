def partition(arr, low, high):
    i = (low -1)
    pivot = arr[high]

    for j in range(low, high):

        # if curr element is smaller than or equal to pivot
        if arr[j] <= pivot:

            # increment index of smaller element
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return (i + 1)

def quickSort(arr, low, high):
    if len(arr) == 1:
        return arr
    if low < high:

        # pi is partitioning index, arr[p] is now at the rigth place
        pi = partition(arr, low, high)

        # separately sort elements before partition and after partition
        quickSort(arr, low, pi-1)
        quickSort(arr, pi+1, high)

# Driver Code

if __name__ == "__main__":
    arr = [8,4,23,42,16,15]
    n = len(arr)
    quickSort(arr, 0, n - 1)
    print("sorted array is: ")
    for i in range(n):
        print("%d" % arr[i])

