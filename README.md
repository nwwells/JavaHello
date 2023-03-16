# JavaHello
Hey, this is just a simple way for me to get back up to speed on Java dev tools. The point is not the code, it's the development environment.

Current dependencies:

* [ahoy-cli](https://ahoy-cli.readthedocs.io/en/latest/)
* [zsh](https://www.zsh.org/)

Check out `ahoy help` once you have the dependencies to run stuff from the CLI.

Most of this is just getting Java to work in VS Code, which may be a fools errand? Issues so far

1. Coverage is [painful compared to IDEs](https://github.com/microsoft/vscode-java-test/issues/387), though that may [be fixed eventually](https://github.com/microsoft/vscode/issues/123713).
2. Debugging isn't as powerful as I remember in IDES like IntelliJ
3. Still need to do dep mgmt... probably going to use Gradle since I have PTSD from former days with Maven.