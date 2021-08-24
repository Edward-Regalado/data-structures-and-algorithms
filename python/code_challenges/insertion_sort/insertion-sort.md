
arr = [8, 4, 23, 42, 16, 15]

def insertion_sort(arr):

    for i in range(1, len(arr)):
        print(f'Index: {i}')
        print(f'arr length: {len(arr)}')
        key = arr[i]
        print(f'Key: {key}')
        j = i - 1
        print(f'J: {j}\n')

        print("//////While Loop Starts///////\n")
        while j >= 0 and key < arr[j]:
            print(f'arr at start of while loop: {arr}')
            arr[j + 1] = arr[j]
            print(f'arr at middle of while loop: {arr}')
            j -= 1
            print(f'J in while loop: {j}')
        arr[j + 1] = key
        print(f'arr at end of while loop: {arr}')

insertion_sort(arr)
print ("Sorted array is:")
for i in range(len(arr)):
    print ("%d" %arr[i])

