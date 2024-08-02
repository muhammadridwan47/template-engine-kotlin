<?xml version="1.0" encoding="UTF-8"?>
<data>
    <items>
       <#list items as item>
            <item>
                <name>${item.name?upper_case}</name>
                <name>${toUpperCase(item.name)}</name>
                <value>${item.value}</value>
                <#if item.active>
                  <status>Active</status>
                <#else>
                  <status>Inactive</status>
                </#if>
            </item>
       </#list>
    </items>
</data>
