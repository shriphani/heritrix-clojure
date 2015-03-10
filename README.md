# heritrix-clojure

A Clojure library for speaking to Heritrix. It is ghetto as fuck - for
instance the way we've solved the SSL cert shit :D.

## Usage

Include in leiningen: 

```
user=> (use 'heritrix-clojure.core :reload)
nil
user=> (create-job "https://localhost:8443/engine/" "create-test" "admin" "admin")
...
...

```

You get the picture.

## License

Copyright © 2015 Shriphani Palakodety

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
