# java_design_pattern
デザインパターンを学ぶための資料です

## Iteratorパターン
集合体（Aggregate)内部の要素を順番に取り出すための方法（Iterator）を提供するデザインパターンのこと。

**BookShelfをどのように修正しようとも、BookShelfがiteratorメソッドを持っていて、正しいIterator<Book>を返してくれさえすればmainを変更する必要がない**