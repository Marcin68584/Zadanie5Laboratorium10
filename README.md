# BankInfo - Application for Retrieving Bank Information from NBP

## Description
The **BankInfo** application prompts the user for the first three digits of their account number, retrieves data from a file located at `https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt`, and checks if the given bank code exists in the file. If found, it prints the bank's name, otherwise, it returns a message indicating the bank code was not found.

The application reads the data from the file online and filters it to find the matching bank number, then displays the corresponding bank's name.

## How the Program Works
1. The program prompts the user for the first three digits of their account number (the bank code).
2. It fetches the data from the file `plewibnra.txt` hosted on the NBP (National Bank of Poland) website.
3. It filters through the file to find the line that starts with the bank code.
4. If a matching bank code is found, it extracts and displays the corresponding bank name. If not found, it displays a "Not found" message.

## How to Run the Application

1. **Clone the repository to your computer:**
   ```bash
   git clone https://github.com/your-repository.git
