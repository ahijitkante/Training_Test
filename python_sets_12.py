def flatten_nested_list(nested):
    result = []

    for item in nested:
        if isinstance(item, list):
            result.extend(flatten_nested_list(item))
        else:
            result.append(item)

    return result


def filter_primes(numbers):
    def is_prime(n):
        if n < 2:
            return False
        if n == 2:
            return True
        if n % 2 == 0:
            return False

        i = 3
        while i * i <= n:
            if n % i == 0:
                return False
            i += 2

        return True

    return [num for num in numbers if is_prime(num)]


class BankAccount:
    def __init__(self, initial_balance=0.0):
        self.balance = initial_balance if initial_balance >= 0 else 0.0

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
        return self.balance

    def withdraw(self, amount):
        if 0 < amount <= self.balance:
            self.balance -= amount
        return self.balance

    def get_balance(self):
        return self.balance
