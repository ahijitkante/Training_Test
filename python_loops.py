def flatten_dictionary(d, parent_key='', sep='.'):
    flattened = {}

    for key, value in d.items():
        new_key = f"{parent_key}{sep}{key}" if parent_key else key

        if isinstance(value, dict):
            flattened.update(flatten_dictionary(value, new_key, sep))
        else:
            flattened[new_key] = value

    return flattened