# java design pattern
## Iteratorパターン
集合体（Aggregate)内部の要素を順番に取り出すための方法（Iterator）を提供するデザインパターンのこと。

**練習問題ポイント**

`BookShelf`をどのように修正しようとも、`BookShelf`が`iterator`メソッドを持っていて、正しい`Iterator<Book>`を返してくれさえすれば`main`を変更する必要がない

## Adapterパターン
「すでに提供されているもの(Adaptee)」と「必要なもの(Target)」の間の「ずれ」を埋めるデザインパターンのこと。

**練習問題ポイント**

```java
Print print = new PrintBanner();
```

スタック領域に対して`Print`型の参照を持った`print`が格納される。
そして、ヒープ領域に対して`PrintBanner`型の実態が格納される。
このことによって、メソッドの内容は`PrintBanner`型のものが利用されることになる。
また、`Print`インターフェイスのメソッドだけ用いるという点を強調できる。

**スタック領域**
- 変数`print`が格納
- 型は`Print`
- 値はヒープ上のオブジェクトの参照

**ヒープ領域**
- `new PrintBanner()`によって生成されたオブジェクトが格納
- 実態は`PrintBanner`型

**練習問題ポイント**

[Javaプロパティファイル](https://qiita.com/AsahinaKei/items/93e50eee48e317814fbd)

プロパティファイルは「外部ファイル」のこと。アプリケーションの設定情報を「外部ファイル」としてアプリケーションと分離させることで、コードの再コンパイルやアプリケーションの再ビルドをせずに挙動を変えることなどができ便利。


## Template Methodパターン
スーパークラスで処理の枠組みを定めて、サブクラスでその具体的な内容を定めるデザインパターンのこと。

**練習問題ポイント**

[InputStream](https://docs.oracle.com/javase/jp/8/docs/api/java/io/InputStream.html)

### アクセス修飾子（アクセス演算子）とは？
Javaのクラス・メソッド・フィールドに対して「**どこからアクセスできるか**」を制御するもの。

| 修飾子 | 意味 | アクセス範囲 |
|--------|------|--------------|
| `public` | 公開 | どこからでもOK |
| `protected` | 継承元・同一パッケージ | サブクラスと同一パッケージ |
| （なし） | パッケージプライベート | 同一パッケージ内のみ |
| `private` | 非公開 | 同一クラス内のみ |

---

### `final` とは？
「**これ以上変更できません！**」という制限をかけるキーワード。

| 用途     | 例                        | 意味                         |
|----------|---------------------------|------------------------------|
| 変数     | `final int x = 10;`       | 値の再代入禁止（定数）       |
| メソッド | `final void run()`        | オーバーライド禁止           |
| クラス   | `final class Foo`         | 継承禁止（サブクラス作れない）|

---
## Factory Methodパターン
Templateパターンに対して、インスタンス生成の場面に適用したデザインパターンのこと。

sampleでは、`framework`パッケージは`idcard`パッケージを呼び出していないことから「`framework`パッケージは`idcard`パッケージに依存していない」と表現できます。

### static Factory Methodについて
インスタンス生成のためのクラスメソッドをstatic Factory Methodと呼ぶ。

**練習問題ポイント**

Concreateなクラスのみ修正

## Singletonパターン
インスタンス生成を限定することを保証するデザインパターンのこと。


**練習問題ポイント**

[Arrays](https://docs.oracle.com/javase/jp/8/docs/api/java/util/Arrays.html)

[ラムダ式](https://qiita.com/kenRp01/items/4045a7925340088bd7e3)

解答の初期化子は以下と同等

```java
Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
# 同等
for (String s : names) {
    map.put(s, new Triple(s));
}
```

**練習問題ポイント**

synchronizedを付与することで「このメソッドは1つのスレッドしか同時に実行しない」といロックをかけることができる。

```java
public static synchronized SynchronizedSingleton getInstance() {
	if(singleton == null) {
		singleton = new SynchronizedSingleton();
	}
	return singleton;
}
``` 

イメージ


```bash
Thread A:  →→ getInstance() ←🔒 ロックを取得！他は待って！
              ↓
          singleton == null → new BadSingleton()
              ↓
              return instance
              🔓 ロック解除

Thread B: （その間は待機）
Thread C: （その間は待機）
Thread D: （その間は待機）
```

## Prototypeパターン

インスタンスから別のインスタンスを作り出すパターンのこと。

(Cloneable)[https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Cloneable.html]インターフェイスにはメソッドは1つも宣言されていない。単に「cloneによってコピーすることができる」という印にすぎない（**マーカーインターフェイス**）

### cloneメソッドは浅いコピーに使う
フィールドの内容をそのままコピーする。ちょっとつかいづらい。

**練習問題ポイント**
コピーコンストラクタ
