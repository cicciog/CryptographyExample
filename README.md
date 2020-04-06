# CryptographyExample

## Message Digest
<p align="justify">
Hash functions are extremely useful and appear in almost all information security applications. A hash function is a mathematical function that converts a numerical input value into another compressed numerical value. The input to the hash function is of arbitrary length but output is always of fixed length. Hash function coverts data of arbitrary length to a fixed length. This process is often referred to as hashing the data. In general, the hash is much smaller than the input data, hence hash functions are sometimes called compression functions. Since a hash is a smaller representation of a larger data, it is also referred to as a digest. Values returned by a hash function are called message digest or simply hash values.
</p>  
<p align="center">
  <img src="https://github.com/cicciog/CryptographyExample/blob/master/images/hash_functions.png" alt="Hash function" />
</p>

## Symmetric key encryption or Private key encryption
<p align="justify">
Symmetric key cryptography (or symmetric encryption) is a type of encryption scheme in which the same key is used both to encrypt and decrypt messages. Such a method of encoding information has been largely used in the past decades to facilitate secret communication between governments and militaries. Nowadays, symmetric key algorithms are widely applied in various types of computer systems to enhance data security. Symmetric encryption schemes rely on a single key that is shared between two or more users. The same key is used to encrypt and decrypt the so-called plaintext (which represents the message or piece of data that is being encoded). The process of encryption consists of running a plaintext (input) through an encryption algorithm called a cipher, which in turn generates a ciphertext (output). If the encryption scheme is strong enough, the only way for a person to read or access the information contained in the ciphertext is by using the corresponding key to decrypt it. The process of decryption is basically converting the ciphertext back to plaintext.
</p>
<p align="center">
  <img src="https://github.com/cicciog/CryptographyExample/blob/master/images/symmetric-encryption.png" alt="Private key encryption" />
</p>

## Asymmetric key encryption or Public key encryption
<p align="justify">
Unlike symmetric key cryptography, we do not find historical use of public-key cryptography. It is a relatively new concept. Symmetric cryptography was well suited for organizations such as governments, military, and big financial corporations were involved in the classified communication. With the spread of more unsecure computer networks in last few decades, a genuine need was felt to use cryptography at larger scale. The symmetric key was found to be non-practical due to challenges it faced for key management. This gave rise to the public key cryptosystems.
The most important properties of public key encryption scheme are:
1. Different keys are used for encryption and decryption. This is a property which set this scheme different than symmetric encryption scheme.
2. Each receiver possesses a unique decryption key, generally referred to as his private key.
3. Receiver needs to publish an encryption key, referred to as his public key.
4. Some assurance of the authenticity of a public key is needed in this scheme to avoid spoofing by adversary as the receiver. Generally, this type of cryptosystem involves trusted third party which certifies that a particular public key belongs to a specific person or entity only.
5. Encryption algorithm is complex enough to prohibit attacker from deducing the plaintext from the ciphertext and the encryption (public) key.
6. Though private and public keys are related mathematically, it is not be feasible to calculate the private key from the public key. In fact, intelligent part of any public-key cryptosystem is in designing a relationship between two keys.
</p>
<p align="center">
  <img src="https://github.com/cicciog/CryptographyExample/blob/master/images/public-key-encryption.png " alt="Public key encryption" />
</p>

## Message Authentication Codes
<p align="justify">
MAC algorithm is a symmetric key cryptographic technique to provide message authentication. For establishing MAC process, the sender and receiver share a symmetric key K. Essentially, a MAC is an encrypted checksum generated on the underlying message that is sent along with a message to ensure message authentication. The sender uses some publicly known MAC algorithm, inputs the message and the secret key K and produces a MAC value. Similar to hash, MAC function also compresses an arbitrary long input into a fixed length output. The major difference between hash and MAC is that MAC uses secret key during the compression. The sender forwards the message along with the MAC. Here, we assume that the message is sent in the clear, as we are concerned of providing message origin authentication, not confidentiality. If confidentiality is required then the message needs encryption. On receipt of the message and the MAC, the receiver feeds the received message and the shared secret key K into the MAC algorithm and re-computes the MAC value. The receiver now checks equality of freshly computed MAC with the MAC received from the sender. If they match, then the receiver accepts the message and assures himself that the message has been sent by the intended sender. If the computed MAC does not match the MAC sent by the sender, the receiver cannot determine whether it is the message that has been altered or it is the origin that has been falsified.
</p>
<p align="center">
  <img src="https://github.com/cicciog/CryptographyExample/blob/master/images/mac.png" alt="MAC" />
</p>

