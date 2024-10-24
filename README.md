# swiftly-transaction-service

Handle all financial transactions related to accounts, including creating, retrieving, and listing transactions.

## APIs
Note: base endpoint: /api/transactions

### GET /
* Purpose: List all transactions.
* Description: Retrieves a list of all transactions in the system.

### GET /{accountId}
* Purpose: List all transactions for a given account.
* Description: Returns a list of all transactions related to the specified account.

### GET /{userId}
* Purpose: List all transactions for a given user.
* Description: Returns a list of all transactions related to the specified user.

### POST /create/{accountId}
* Purpose: Create a new transaction.
* Description: Initiates a financial transaction (e.g., deposit, withdrawal, transfer) and associates it with an account.

### GET /{transactionId}
* Purpose: Retrieve details of a specific transaction.
* Description: Fetches information about a particular transaction by its ID.

### GET /{transactionId}/status
* Purpose: Get the status of a specific transaction.
* Description: Returns the current status of the transaction (e.g., pending, completed, failed).
