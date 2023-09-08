#include <iostream>
#include <string>

using namespace std;

class BankAccount {
private:
    string name;
    string account_no;
    string account_type;
    double balance;

public:
    // Constructor to initialize data members
    BankAccount(const string& _name, const string& _account_no, const string& _account_type, double _balance)
        : name(_name), account_no(_account_no), account_type(_account_type), balance(_balance) {
    }

    // Function to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Deposited " << amount << " successfully. New balance: " << balance << endl;
        } else {
            cout << "Invalid amount for deposit." << endl;
        }
    }

    // Function to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "Withdrew " << amount << " successfully. New balance: " << balance << endl;
        } else {
            cout << "Insufficient funds or invalid amount for withdrawal." << endl;
        }
    }

    // Function to display account details
    void display_details() {
        cout << "Name: " << name << endl;
        cout << "Account No.: " << account_no << endl;
        cout << "Account Type: " << account_type << endl;
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    BankAccount account("John Doe", "123456789", "Savings", 1000.0);
    account.display_details();
    account.deposit(500);
    account.withdraw(200);

    return 0;
}