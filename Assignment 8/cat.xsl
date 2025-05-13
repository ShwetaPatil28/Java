<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html"/>
  
  <xsl:template match="/">
    <html>
      <body>
        <h2>My Movie Collection</h2>  
        <xsl:apply-templates/>  
      </body>
    </html>
  </xsl:template>

  <xsl:template match="movie">
    <p>
      <xsl:apply-templates select="title"/>  
      <xsl:apply-templates select="director"/>
    </p>
  </xsl:template>

  <xsl:template match="title">
    Title: <span style="color:#0000ff">
    <xsl:value-of select="."/></span>
    <br />
  </xsl:template>

  <xsl:template match="director">
    Director: <span style="color:#ff6600">
    <xsl:value-of select="."/></span>
    <br />
  </xsl:template>

</xsl:stylesheet>
