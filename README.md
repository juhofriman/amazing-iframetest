# Uskomaton iframe-testi

Tartteet: leiningen ja joku millä servata staattista kontenttia.

Uskomaton lomakekäsittelijä käyntiin

```
lein ring server-headless
```

Sit servataan parent-saittia:

```
cd parant-site
python -m SimpleHTTPServer 9999
```

Parent:
http://localhost:9999/parent-site.html

Formin submittaaminen onnistuu ja palvelimen redirect onnistuu KUNHAN formissa on target="_parent".
