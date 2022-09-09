# Simple-App
A very basic Node.js app to use as an example for workflows using GitHub Actions.

## Workflow status
[![.github/workflows/deploy_azure.yml](https://github.com/gidavies/simple-app/actions/workflows/deploy_azure.yml/badge.svg)](https://github.com/gidavies/simple-app/actions/workflows/deploy_azure.yml)

[![.github/workflows/deploy_on_label.yml](https://github.com/gidavies/simple-app/actions/workflows/deploy_on_label.yml/badge.svg)](https://github.com/gidavies/simple-app/actions/workflows/deploy_on_label.yml)

[![.github/workflows/pr_checks.yml](https://github.com/gidavies/simple-app/actions/workflows/pr_checks.yml/badge.svg)](https://github.com/gidavies/simple-app/actions/workflows/pr_checks.yml)

## Workflows

The Node app can be deployed to Azure App Service with the included workflows, which are based on the default Actions. There are workflows that are triggered on the following events:
- PR
- Adding a label during a PR
- Merging into main

There is also a simple resuable workflow, build.yml, which is called from the other workflows to show how to avoid duplication and keep maintenance simpler:

```mermaid
flowchart LR

A(PR) -->|Triggers| B(pr_checks.yml)
B -->|Calls| C(build.yml)
D(Add label in PR) -->|Triggers| E(deploy_on_label.yml)
E -->|Calls| C(build.yml)
F(Merge in main) -->|Triggers| G(deploy_azure.yml)
G -->|Calls| C(build.yml)

```
(This is an embedded [Markdown defined Mermaid diagram](https://github.blog/2022-02-14-include-diagrams-markdown-files-mermaid/))
