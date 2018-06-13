USE [example]
GO
/****** Object:  Table [dbo].[user]    Script Date: 2017-12-06 17:16:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](50) NULL,
	[createTime] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
