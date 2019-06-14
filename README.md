# csc-4clj

Small repo for having 4clojure problems as an offline resource.

## Usage

The `csc-4clj.core` namespace includes functions for fetching the
problems (by id) and writing them to a clojure file.

On every problem namespace a var `__` is defined:

```clojure
(def __
  (fn []
    ,,,))
```

If you want to submit your solution to 4clojure it should be enough to
copy and paste the inner `fn` to the site.

## License

Copyright © 2019 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
