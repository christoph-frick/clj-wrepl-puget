# clj-wrepl-puget

`print` implementiation for [clj-wrepl](https://github.com/christoph-frick/clj-wrepl) using [puget](https://github.com/greglook/puget)

## Setup

Add in your *wrepl* config:

```clojure
{:wrepl/print #ig/ref :wrepl.puget/print
 :wrepl.puget/print {:color-scheme {:delimiter [:red]
                                    :string nil
                                    :character nil
                                    :keyword [:yellow]
                                    :symbol [:magenta]
                                    :function-symbol [:bold :magenta]
                                    :class-delimiter [:magenta]
                                    :class-name [:bold :magenta]}}}
```

For all config options see the [`puget.printer` ns doc-string](https://github.com/greglook/puget/blob/master/src/puget/printer.clj)
