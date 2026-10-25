def join_lists(list1, list2):
    dict2 = {d['id']: d for d in list2}
    result = []
    for d1 in list1:
        if d1['id'] in dict2:
            combined = {**d1, **dict2[d1['id']]}
            result.append(combined)
    return result


def group_by_age(people):
    age_dict = {}
    for person in people:
        age = person['age']
        name = person['name']
        if age not in age_dict:
            age_dict[age] = []
        age_dict[age].append(name)
    return age_dict