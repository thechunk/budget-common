# Budget - Common
## Encrypting Properties

```sh
java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar \
    org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI \
    input="secret" password=password \
    algorithm=PBEWithMD5AndDES
```