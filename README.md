# CryptographyExample

## Message Digest

Hash functions are extremely useful and appear in almost all information security applications. A hash function is a mathematical function that converts a numerical input value into another compressed numerical value. The input to the hash function is of arbitrary length but output is always of fixed length. Hash function coverts data of arbitrary length to a fixed length. This process is often referred to as hashing the data. In general, the hash is much smaller than the input data, hence hash functions are sometimes called compression functions. Since a hash is a smaller representation of a larger data, it is also referred to as a digest. Values returned by a hash function are called message digest or simply hash values.

## Symmetric key encryption or Private key encryption
## Asymmetric key encryption or Public key encryption

Unlike symmetric key cryptography, we do not find historical use of public-key cryptography. It is a relatively new concept. Symmetric cryptography was well suited for organizations such as governments, military, and big financial corporations were involved in the classified communication. With the spread of more unsecure computer networks in last few decades, a genuine need was felt to use cryptography at larger scale. The symmetric key was found to be non-practical due to challenges it faced for key management. This gave rise to the public key cryptosystems.
The most important properties of public key encryption scheme are:
1) Different keys are used for encryption and decryption. This is a property which set this scheme different than symmetric encryption scheme.
2) Each receiver possesses a unique decryption key, generally referred to as his private key.
3) Receiver needs to publish an encryption key, referred to as his public key.
4) Some assurance of the authenticity of a public key is needed in this scheme to avoid spoofing by adversary as the receiver. Generally, this type of cryptosystem involves trusted third party which certifies that a particular public key belongs to a specific person or entity only.
5) Encryption algorithm is complex enough to prohibit attacker from deducing the plaintext from the ciphertext and the encryption (public) key.

Though private and public keys are related mathematically, it is not be feasible to calculate the private key from the public key. In fact, intelligent part of any public-key cryptosystem is in designing a relationship between two keys.
## Message Authentication Codes
