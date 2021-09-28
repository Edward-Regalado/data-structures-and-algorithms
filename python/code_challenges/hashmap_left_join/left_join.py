left = {
    "fond": "enamored",
    "wrath": "anger",
    "diligent": "employed",
    "outfit": "garb",
    "guide": "usher",
}


right = {
    "fond": "averse",
    "wrath": "delight",
    "diligent": "idle",
    "guide": "follow",
    "flow": "jam"}

def left_join(hm1, hm2):
    results = []
    v1 = list(hm1.values())
    v2 = list(hm2.values())
    k1 = list(hm1.keys())
    k2 = list(hm2.keys())

    for i in range(len(k1)):
        for j in range(len(k2)):
            if (k1[i] == k2[j]):
                matched = [k1[i], v1[i], v2[j]]
                results.append(matched)


        new_hashtable = [k1[i], v1[i], None]
        results.append(new_hashtable)

    # print(results)
    return results

# left_join(left, right)


